package com.azdine.dev.employeeList;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeListProblem{
  private static final String SPLITTER = "; ";
  private static final String EMPTY_CHARACTER = "";
  private static final String SPACE = " ";
  private static final String DOT = ".";
  private static final String AT = "@";
  private static final String DOT_COM = ".com";

     public String solution(String S, String C){

         StringBuilder strBuilder = new StringBuilder();
         Map<Integer,String > emailsMap = new HashMap<Integer, String>();

         // getListof Names

         List<String> listOfNames = getListOfNames(S);
         for(int index =0; index < listOfNames.size(); index ++){
             String name = listOfNames.get(index);
             String[] T = name.split(SPACE);
             String email = fabricateEmail(name,C);

             if(emailsMap.containsValue(email)){
                 String newEmail = getRidOfDoubleEmails(email);
                 strBuilder.append(newEmail);
                 strBuilder.append(SPLITTER);
                 emailsMap.put(index, newEmail);

             }else{
                 strBuilder.append(email);
                 strBuilder.append(SPLITTER);
                 emailsMap.put(index, email);
             }
         }

         return strBuilder.toString();
     }


    public static  String getRidOfDoubleEmails(String email){
        String newEmail = null;
        int position = email.indexOf('@');
        char c = email.toCharArray()[position-1];

        boolean isDigit = Character.isDigit(c);
        if(isDigit){
            String s = String.valueOf(c);
            int digit = Integer.parseInt(s);
            newEmail = email.substring(0,position-1) + String.valueOf(digit+1) + email.substring(position);
        }else {
            newEmail = email.substring(0,position) + "1"+ email.substring(position);
        }
        return newEmail;
    }
    private String fabricateEmail(String fullName, String companyName){
        StringBuilder email = new StringBuilder();
        String[] T = fullName.toLowerCase().split(SPACE);
        String tranformed = transformString(T[T.length-1]);
        email.append(T[0]);
        email.append(DOT);
        email.append(tranformed);
        email.append(AT);
        email.append(companyName);
        email.append(DOT_COM);

        return email.toString();
    }

    /**
     * this function do the following things
     * remove hyphens
     * toLowerCase
     * trancate to 8 letters
     * @param S
     * @return
     */
    private  static  String transformString(String S){
        String[] hyphens = new String[]{ ",", ".", "/", "!", "@", "#", "$",
        "%", "^", "&", "*", "'","-", "_"};
        for(int i = 0; i<hyphens.length;i++){
            // remove Hyphens
            if(S.contains(hyphens[i])){
              S = S.replace(hyphens[i],EMPTY_CHARACTER);
            }
        }
        // To Lower Case
         String lowerCase = S.toLowerCase();

        // String Trancate String
         String trunctedString = truncate(lowerCase, 8);
         return  trunctedString;
    }


    /**
     * this function return a list of names give a String S
     * @param S
     * @return
     */
  private List<String> getListOfNames(String S){

      List<String> listOfNames = new ArrayList<String>();
      String[] splittedNames = S.split(SPLITTER) ;

      for(String name : splittedNames){
          listOfNames.add(name);
      }

      return listOfNames;
   }

    /**
     *  this function truncate a give String
      * @param value
     * @param length
     * @return
     */
   public static String truncate(String value, int length) {
        if (value.length() > length) {
            return value.substring(0, length);
        } else {
            return value;
        }
    }

}