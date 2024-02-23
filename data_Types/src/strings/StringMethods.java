package strings;

public class StringMethods {
    public static void main(String[] args) {
// 012345
//        String name = "Damira";
//        // 123456
//        System.out.println(name.length()); //6
//        System.out.println(name.charAt(3)); //i
//        String surname = "Asanova";
//        System.out.println(name + surname); //concatDamiraAsanova
//        System.out.println(name.concat(surname)); //DamiraAsanova
//        System.out.println(2+2+"alma");
//        System.out.println("alma"+2+2);
//        System.out.println("alma"+(2+2)+2);
//
//        // substring     //0123456  index
//        String notebook = "Macbook";
//        //  1234567   dlina
//        System.out.println("___________");
//        System.out.println(notebook.substring(3));//book
//        System.out.println(notebook.substring(0,4)); //Macb
//        System.out.println(notebook.substring(0,2)); //Mas
//        System.out.println(notebook.substring(6));
//        System.out.println(notebook.substring(4,6)); //00

    String country = "  Kyrgyzstan  ";
        System.out.println(country.trim());
        String country1= "Germany";
        System.out.println(country1.indexOf("m"));
        System.out.println(country1.indexOf("er"));
        String film= "Dyavol nosit Prada";
        System.out.println(film.indexOf("a",7));

        System.out.println(film.indexOf("no",4
        ));
        //            01234567890123456789012
        String book= "     Anna Karenina     ";
        System.out.println(book.toLowerCase());//anna karenina
        System.out.println(book.toUpperCase().trim());//ANNA KARENINA
        System.out.println(book.charAt(3));
        System.out.println(book.codePointAt(5));
        System.out.println(book.contains("anna"));
        System.out.println(book.endsWith(" "));
        String book1= "Harry poter";
       // System.out.println(book1.str.su));
//        System.out.println(book1.);
        System.out.println(book1.replace('p','P' ));

        



    }


    }
