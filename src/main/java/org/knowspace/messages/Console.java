package org.knowspace.messages;

public class Console {
    
    private static final String RESET = "\033[0m";
    private static final String WARNING_LABEL = "\033[5;30;43m";
    private static final String WARNING_TEXT = "\033[0;33;40m";
    private static final String SUCCESS_LABEL = "\033[5;30;42m";
    private static final String SUCCESS_TEXT = "\033[0;32;40m";
    private static final String STATUS_LABEL = "\033[5;30;44m";
    private static final String STATUS_TEXT = "\033[1;37;40m";
    
    private static void print(String HeaderColor, String Header, String TextColor, String Msg){
        System.out.println(HeaderColor + Header + Console.RESET);
        System.out.println(TextColor + Msg + Console.RESET);
    }

    public static void printWarning(String WarningMessage){
        Console.print(Console.WARNING_LABEL, " WARNING ", Console.WARNING_TEXT, WarningMessage);
    }

    public static void printSuccess(String SuccessMessage){
        Console.print(Console.SUCCESS_LABEL, " SUCCESS ", Console.SUCCESS_TEXT, SuccessMessage);
    }

    public static void printStatus(String StatusLabel, String StatusMessage){
        Console.print(Console.STATUS_LABEL, StatusLabel, Console.STATUS_TEXT, StatusMessage);
    }
}
