
package com.usjt.projeto.vaccineasy.uteis;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static Date converter(String s) throws Exception{
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       return sdf.parse(s);
    }
}
