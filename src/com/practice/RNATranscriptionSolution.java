package com.practice;

class RnaTranscription {
    String transcribe(String dnaStrand) {
        String transcribedRNA="";
        for(int i =0; i< dnaStrand.length();i++){
            switch(dnaStrand.charAt(i)){
                case 'G': transcribedRNA+='C';
                    break;
                case 'C': transcribedRNA+='G';
                    break;
                case 'A': transcribedRNA+='U';
                    break;
                case 'T': transcribedRNA+='A';
                    break;
            }
        }
        return transcribedRNA;
    }
}
public class RNATranscriptionSolution {
    public static void main(String[] args) {
        RnaTranscription rnaTranscription = new RnaTranscription();
        String dnaStrand = "GCATGCCATACG";
        System.out.println("Transcribed RNA ==> "+rnaTranscription.transcribe(dnaStrand));

    }
}
