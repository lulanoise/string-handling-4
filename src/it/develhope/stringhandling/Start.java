package it.develhope.stringhandling;

public class Start {
    public static void main(String[] args) {

        String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String changedS = veryLongString.replaceAll("um","HUM");

        int index = veryLongString.indexOf("aliquip");
        String sub1 = changedS.substring(0,index);
        String sub2 = changedS.substring(index);

        System.out.println(sub1.trim());
        System.out.println(sub2.trim());

        System.out.println(sub1.contains("est")^ sub2.contains("est"));
    }
}
