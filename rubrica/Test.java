package rubrica;

import java.util.LinkedList;

public class Test {

        public static void main(String[] args)
        {
            Persona chiara=new Persona("chiara","caporro","3290612761");
            Persona christian=new Persona("christian","ruggieri","392058746");
            LinkedList<Persona> elenco=new LinkedList<Persona>();
            elenco.add(chiara);
            elenco.add(christian);
            Rubrica rubrica =new Rubrica(elenco);
            rubrica.trovaPersona("chiara", "caporro");
            rubrica.aggiungi("paolo","rossi","3283322486");

            rubrica.trovaPersone("mario","rossi");

        }
    }

