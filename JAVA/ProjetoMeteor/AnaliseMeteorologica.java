package ProjetoMeteor;

import javax.print.attribute.standard.Media;

public class AnaliseMeteorologica {
    public static void FormatacaoTexto(double[][] temp, int[][] um, double MediaGeral){
        System.out.print("======================================================\r\n");
        System.out.print("      SISTEMA DE ANÁLISE METEOROLÓGICA INTELIGENTE\r\n");
        System.out.print("====================================================== \n\n");
        System.out.println("ANÁLISE DETALHADA POR CIDADE:");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("CIDADE | T.MAX | T.MIN | T.MÉD | UMID% | CLASSIFICAÇÃO     | ALERTA");
        System.out.println("-------------------------------------------------------------------");
        for(int i = 0; i < temp.length; i++){
            double mediaTemp = (temp[i][0] * 0.7) + (temp[i][1] * 0.3);
            double mediaTemperatura = Math.round(mediaTemp * 10.0) / 10.0;
            double mediaUmidade = (um[i][0] + um[i][1] + um[i][2]) / 3.0;
            double mediaUmi = Math.round(mediaUmidade * 10.0) / 10.0;
            String classsificacao = classificarClima(mediaTemp, mediaUmidade);
            int alerta = gerarAlertas(temp[i][0], temp[i][1], mediaUmi);

            String alertaTexto;
            if(alerta == 2){
                alertaTexto = "VERMELHO";
            }else if(alerta == 1){
                alertaTexto = "AMARELO";
            }else{
                alertaTexto = "VERDE";
            }
            System.out.println("   " + (i + 1) + "   | "
                    + temp[i][0] + "°C| "
                    + temp[i][1] + "°C| "
                    + mediaTemperatura + "°C| "
                    + mediaUmi + "  | "
                    + classsificacao
                    + alertaTexto);
        }
        System.out.println("------------------------------------------------------------------- \n");
        System.out.println("ESTATÍSTICAS GERAIS:");
        System.out.println("• Temperatura média geral: "+MediaGeral+"°C");
        
    }
    public static double calcularMediaGeral(double[][] temperaturas){
        double somaMedias = 0;

        for(int i = 0; i < temperaturas.length; i++){
            double mediaCidade = (temperaturas[i][0] * 0.7)
                            + (temperaturas[i][1] * 0.3);

            somaMedias += mediaCidade;
        }

        double mediaFinal = somaMedias / temperaturas.length;
        return Math.round(mediaFinal * 10.0) / 10.0;
    }
    public static void calcularMediaPonderadaTemperatura(double max, double min){
        if (min >= -50 && max <= 60 ) {
            
        }
    }
    public static String classificarClima(double tempMedia, double umidadeMedia){
        if (tempMedia > 30 && umidadeMedia > 75){
            return "MUITO QUENTE      | ";
        }else if(tempMedia >= 20 && tempMedia <= 25 && umidadeMedia >= 50 && umidadeMedia <= 70){
            return "CONFORTÁVEL       | ";
        }else if(tempMedia <= 15 && tempMedia >= 0 && umidadeMedia <= 50 && umidadeMedia >= 0 ){
            return "FRIO E SECO   | ";
        }else{
            return "QUENTE MODERADO   | ";
        }
    }
    public static double calcularIndiceCalor(double temp, int umidade){
        double indiceCalor = temp + 0.5 * (umidade / 100.0) * (temp - 20);
        return Math.round(indiceCalor * 10.0) / 10.0;
    }
    public static int gerarAlertas(double tempMax, double tempMin, double umidadeMedia){

        double variacao = tempMax - tempMin;
        if(tempMax > 35 || umidadeMedia > 90){
            return 2;
        }else if((tempMax >= 30 && tempMax <= 35 || umidadeMedia > 80)
                || variacao > 15){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        // Temperaturas: [máxima, mínima] para 5 cidades
        double[][] temperaturas = {
            {32.5, 22.1},  // Cidade 1
            {28.3, 18.7},  // Cidade 2
            {35.8, 24.9},  // Cidade 3
            {30.2, 20.5},  // Cidade 4
            {25.7, 15.3}   // Cidade 5
        };

        // Umidades: [manhã, tarde, noite] para 5 cidades
        int[][] umidades = {
            {85, 60, 75},  // Cidade 1
            {78, 55, 70},  // Cidade 2
            {90, 65, 80},  // Cidade 3
            {82, 58, 72},  // Cidade 4
            {75, 50, 68}   // Cidade 5
        };
        double mediaGeral = calcularMediaGeral(temperaturas);
        FormatacaoTexto(temperaturas, umidades, mediaGeral);

    }
}
