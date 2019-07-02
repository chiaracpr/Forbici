package rubrica;

public class Persona {

        private String nome;
        private String cognome;
        private String numTel;

        public Persona(String nome, String cognome, String numTel)
        {
            this.nome=nome;
            this.cognome=cognome;
            this.numTel=numTel;
        }


        public String getNome () {return this.nome;}

        public String getCognome () {return this.cognome;}

        public String getNumTel() {
         return numTel;
            }

         public void setNumTel(String numTel) {
         this.numTel = numTel;
            }
}


