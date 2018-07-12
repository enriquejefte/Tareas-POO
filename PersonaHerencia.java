public class PersonaHerencia {

    // El programa lo desarolle en IntelliJ IDEA

    public static void main(String[] arg){

        // Estoy creando un array de personas para el cual voy a reservar memoria
        // para la clase padre y las hijas.

        Persona lasPersona[] = new Persona[4];

        lasPersona[0] = new Persona("Cualquier nombre dado", "La edad que tu quieras","Masculino o Femenino?");
        lasPersona[1] = new Persona.Papa("Ingeniero agronomo","Caucasico", "Roberto Paguada", "45 años","masculino");
        lasPersona[2] = new Persona.Mama("Tejer","Azules","Jansuly Flores","37 años","Femenino");
        lasPersona[3] = new Persona.Hijo("Minecraft","Castaño", "Han Solo", "13 años","Masculino");

        //Utilizo un bucle for para que imprima a todas las personas.

        for(Persona personas: lasPersona){
            System.out.println(personas.MostrarDatos());
            System.out.println("");
        }
    }

    // Esta es la clase padre o superclase

    public static class Persona{
        protected String nombre;
        protected String edad;
        protected String sexo;

        public Persona(String nombre, String edad, String sexo){
            this.nombre = nombre;
            this.edad = edad;
            this.sexo = sexo;
        }
        public String getNombre() {
            return nombre;
        }
        public String getEdad() {
            return edad;
        }
        public String getSexo() {
            return sexo;
        }
        public String MostrarDatos() {
            return "Nombre: "+nombre+"\nEdad: "+edad+"\nSexo: "+sexo;
        }

        // Primera subclase

        public static class Papa extends Persona {
            private String ocupacion;
            private String colorpiel;

            public Papa(String ocupacion, String colorpiel, String nombre, String edad, String sexo) {
                super(nombre, edad, sexo);
                this.ocupacion = ocupacion;
                this.colorpiel = colorpiel;
            }

            public String getOcupacion() {
                return ocupacion;
            }

            public String getColorpiel() {
                return colorpiel;
            }

            // Sobreescribiendo el metodo MostrarDatos de la superclase lo cual se hace en las
            // demas subclases.

            @Override
            public String MostrarDatos() {
                return "Nombre: "+nombre+"\nEdad: "+edad+"\nSexo: "+sexo+"\nOcupacion: "+ocupacion+"\nColor de Piel: "+colorpiel;
            }
        }

        // Segunda subclase

        public static class Mama extends Persona {
            private String pasatiempo;
            private String colorojos;

            public Mama(String pasatiempo, String colorojos, String nombre, String edad, String sexo) {
                super(nombre, edad, sexo);
                this.pasatiempo = pasatiempo;
                this.colorojos = colorojos;
            }

            public String getPasatiempo() {
                return pasatiempo;
            }

            public String getColorojos() {
                return colorojos;
            }

            @Override
            public String MostrarDatos() {
                return "Nombre: "+nombre+"\nEdad: "+edad+"\nSexo: "+sexo+"\nPasatiempo: "+pasatiempo+"\nColor de Ojos: "+colorojos;
            }
        }

        // Ultima subclase

        public static class Hijo extends Persona {
            private String juegofav;
            private String colorpelo;

            public Hijo(String juegofav, String colorpelo, String nombre, String edad, String sexo) {
                super(nombre, edad, sexo);
                this.juegofav = juegofav;
                this.colorpelo = colorpelo;
            }

            public String getJuegofav() {
                return juegofav;
            }

            public String getColorpelo() {
                return colorpelo;
            }

            @Override
            public String MostrarDatos() {
                return "Nombre: "+nombre+"\nEdad: "+edad+"\nSexo: "+sexo+"\nVideojuego Favorito: "+juegofav+"\nColor de Pelo: "+colorpelo;
            }
        }

    }
}