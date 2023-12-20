import java.io.*;
import java.util.Properties;

public class ConfigFiles {
    
    //LEER LOS ARCHIVOS DE CONFIGURACION
    public void ReadFileConfiguration(){

        System.out.println("\nPROPIEDADES DEL ARCHIVO 'CONFIGURACION.PROPS':\n");

        //Creo las variables del archivo de propiedades
        String usuario, password, servidor, puerto;
        //Creo un obj de Properties
        Properties configuracion = new Properties();

        try {

            //Leo el archivo de propiedades
            configuracion.load(new FileInputStream("C:\\Users\\mcfal\\OneDrive\\Escritorio\\eclipse-Maven\\s003_Archivos_Configuracion\\src\\main\\resources\\configuracion.props"));

            //Obtengo las propiedades del archivo de configuracion y lo guardo 
            //en las variables
            usuario = configuracion.getProperty("user");
            password = configuracion.getProperty("password");
            servidor = configuracion.getProperty("server");
            puerto = configuracion.getProperty("port");

            System.out.println("El usuario es : " + usuario);
            System.out.println("La password es: " + password);
            System.out.println("El servidor es: " + servidor);
            System.out.println("El puerto es: " + puerto);

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    //MODIFICAR LOS VALORES DE CONFIGURACION
    public void ChangeFileConfiguration(){

        //Declaro las variables
        String miUser = "Mari Carmen";
        String miPassword = "12345";
        String miServer = "192.168.1.2";
        String miPort = "8080";

        //Creo un obj para las modificar las nuevas propiedades de la clase Properties
        Properties configuracion = new Properties();
        configuracion.setProperty("user", miUser);
        configuracion.setProperty("password", miPassword);
        configuracion.setProperty("server", miServer);
        configuracion.setProperty("port", miPort);

        try {

            //Accion a realizar
            //Guarda el contenido de las propiedades en el archivo, añado comentario para describir
            //de que se trata de un archivo de configuracion
            configuracion.store(new FileOutputStream("configuracion.props"), "Fichero de configuracion");
            
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
    }

    public void TestFileConfiguration(){
       System.out.println("Testeando la clase");
    }
}
