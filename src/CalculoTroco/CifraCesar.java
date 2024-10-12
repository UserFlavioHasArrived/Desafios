package CalculoTroco;

import java.text.Normalizer;

public class CifraCesar {
    public String encrypt(String texto, int deslocamento){
        StringBuilder mensagemFinal = new StringBuilder();
       
        deslocamento = deslocamento % 26;

        texto = limparString(texto);
        texto = texto.toUpperCase().replaceAll("^[A-Z]", "");

        for (char letra : texto.toCharArray()){
            char caracterCifrado = (char) (letra + deslocamento);
            
            if(caracterCifrado > 'Z'){
                caracterCifrado -= 26;
            }

            mensagemFinal.append(caracterCifrado);               
        } 

        return mensagemFinal.toString();
    }

    private String limparString(String texto){
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        return texto.replaceAll("[^\\p{ASCII}]","");
    }

    public String decrypt(String texto, int deslocamento){
        StringBuilder mensagemFinal = new StringBuilder();
       
        deslocamento = deslocamento % 26;

        texto = limparString(texto);
        texto = texto.toUpperCase().replaceAll("^[A-Z]", "");

        for (char letra : texto.toCharArray()){
            char caracterCifrado = (char) (letra - deslocamento);
            
            if(caracterCifrado < 'A'){
                caracterCifrado += 26;
            }

            mensagemFinal.append(caracterCifrado);               
        } 

        return mensagemFinal.toString();
    }

}
    
    

