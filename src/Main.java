public class Main{
    static void main(){
        System.out.println("=== PRUEBA SENSOR INDUSTRIAL ===");

        sensor sensorTemp = new sensor();
        sensorTemp.nombre = "Sensor 1";
        sensorTemp.tipo = "Temperatura";
        sensorTemp.unidad = "°C";
        sensorTemp.lectura = 0.0;

        sensor sensorPres = new sensor();
        sensorPres.nombre = "Sensor 2";
        sensorPres.tipo = "Presión";
        sensorPres.unidad = "PSI";
        sensorPres.lectura = 0.0;

        sensor sensorHum = new sensor();
        sensorHum.nombre = "Sensor 3";
        sensorHum.tipo = "Humedad";
        sensorHum.unidad = "%";
        sensorHum.lectura = 0.0;

        sensorTemp.actualizarLectura(24.5);
        sensorTemp.mostrarInformacion();

        sensorPres.actualizarLectura(101.3);
        sensorPres.mostrarLectura();

        sensorHum.actualizarLectura(60.0);
        sensorHum.reiniciarLectura();
    }

}

