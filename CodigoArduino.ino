// Definición de pines
const int IN1 = 9;
const int IN2 = 10;
const int ENA = 11;
//Entrada para mover el motor dede java 
char  mensaje;

void setup() {
  // Configuración de pines como salida
  pinMode(IN1, OUTPUT);
  pinMode(IN2, OUTPUT);
  pinMode(ENA, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  //Condicionales de movimiento
  if(Serial.available()>0){
    //verificamos que recibe el mensaje
    mensaje = Serial.read();

    if(mensaje == 'I'){
      // Establecer dirección del motor
      digitalWrite(IN1, HIGH);
      digitalWrite(IN2, LOW);
      
      // Control de velocidad del motor utilizando la modulación por ancho de pulso (PWM)
      analogWrite(ENA, 250);  // Velocidad de 0 a 255
      
      // Esperar 1 segundo
      delay(1000);
      
      // Detener el motor
      digitalWrite(IN1, LOW);
      digitalWrite(IN2, LOW);
      analogWrite(ENA, 0);
      
      // Terminar el programa
      //while (true) {
      //}      
    }else{
      if(mensaje == 'D'){
        // Establecer dirección del motor
        digitalWrite(IN1, LOW);
        digitalWrite(IN2, HIGH);
        
        // Control de velocidad del motor utilizando la modulación por ancho de pulso (PWM)
        analogWrite(ENA, 250);  // Velocidad de 0 a 255
        
        // Esperar 1 segundo
        delay(1000);
        
        // Detener el motor
        digitalWrite(IN1, LOW);
        digitalWrite(IN2, LOW);
        analogWrite(ENA, 0);
        
        // Terminar el programa
        //while (true) {
        //}      
      }

    }
  }

}

