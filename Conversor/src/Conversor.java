import java.util.HashMap;

public class Conversor {
    static HashMap<String, String> unidadeh = new HashMap<>();
    static HashMap<String, String> dezenah = new HashMap<>();
    static HashMap<String, String> centenah = new HashMap<>();
    static{
        unidadeh.put("0", "zero");
        unidadeh.put("1", "um");
        unidadeh.put("2", "dois");
        unidadeh.put("3", "três");
        unidadeh.put("4", "quatro");
        unidadeh.put("5", "cinco");
        unidadeh.put("6", "seis");
        unidadeh.put("7", "sete");
        unidadeh.put("8", "oito");
        unidadeh.put("9", "nove");
        unidadeh.put("10", "dez");
        unidadeh.put("11", "onze");
        unidadeh.put("12", "doze");
        unidadeh.put("13", "treze");
        unidadeh.put("14", "catorze");
        unidadeh.put("15", "quinze");
        unidadeh.put("16", "dezesseis");
        unidadeh.put("17", "dezessete");
        unidadeh.put("18", "dezoito");
        unidadeh.put("19", "dezenove");

        dezenah.put("2", "vinte");
        dezenah.put("3", "trinta");
        dezenah.put("4", "quarenta");
        dezenah.put("5" ,"cinquenta");
        dezenah.put("6", "sessenta");
        dezenah.put("7", "setenta");
        dezenah.put("8", "oitenta");
        dezenah.put("9", "noventa");

        centenah.put("1", "cem");
        centenah.put("2", "duzentos");
        centenah.put("3", "trezentos");
        centenah.put("4", "quatrocentos");
        centenah.put("5", "quinhentos");
        centenah.put("6", "seiscentos");
        centenah.put("7", "setecentos");
        centenah.put("8", "oitocentos");
        centenah.put("9", "novecentos");
    }

    public void logica(int numero) {
        String texto = Integer.toString(numero);
        int tamanhoNumero = texto.length();
        char[] caracteres = texto.toCharArray();

        String unidadeMilhao = null;
        String centenaMilhar = null;
        String dezenaMilhar = null;
        String unidadeMilhar = null;
        String centena = null;
        String dezena = null;
        String unidade = null;

        StringBuilder resultado = new StringBuilder();

        if (tamanhoNumero == 2 && numero < 20) {
            unidade = String.valueOf(caracteres[0]);


        } else if (tamanhoNumero == 2) {
            dezena = String.valueOf(caracteres[0]);
            unidade = String.valueOf(caracteres[1]);

        } else if (tamanhoNumero == 3) {
           centena = String.valueOf(caracteres[0]);
           dezena = String.valueOf(caracteres[1]);
           unidade = String.valueOf(caracteres[2]);
        } else if (tamanhoNumero == 4) {
           unidadeMilhar = String.valueOf(caracteres[0]);
           centena = String.valueOf(caracteres[1]);
           dezena = String.valueOf(caracteres[2]);
           unidade = String.valueOf(caracteres[3]);
        } else if (tamanhoNumero == 5) {
            dezenaMilhar = String.valueOf(caracteres[0]);
            unidadeMilhar = String.valueOf(caracteres[1]);
            centena = String.valueOf(caracteres[2]);
            dezena = String.valueOf(caracteres[3]);
            unidade = String.valueOf(caracteres[4]);
        } else if (tamanhoNumero == 5) {
            centenaMilhar = String.valueOf(caracteres[0]);
            dezenaMilhar = String.valueOf(caracteres[1]);
            unidadeMilhar = String.valueOf(caracteres[2]);
            centena = String.valueOf(caracteres[3]);
            dezena = String.valueOf(caracteres[4]);
            unidade = String.valueOf(caracteres[5]);
        } else if (tamanhoNumero == 6) {
            unidadeMilhao = String.valueOf(caracteres[0]);
            centenaMilhar = String.valueOf(caracteres[1]);
            dezenaMilhar = String.valueOf(caracteres[2]);
            unidadeMilhar = String.valueOf(caracteres[3]);
            centena = String.valueOf(caracteres[4]);
            dezena = String.valueOf(caracteres[5]);
            unidade = String.valueOf(caracteres[6]);
        }

        if (unidadeMilhao != null && !unidadeMilhao.equals("0")){
            resultado.append(unidadeh.get(unidadeMilhao));

        }
    }
}
