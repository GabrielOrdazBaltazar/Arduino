from gpiozero import Motor
from time import sleep

# Definir pines de control del puente H
IN1 = 17  # Cambia estos valores según tu configuración
IN2 = 27
EN = 22

# Crear un objeto Motor
motor = Motor(forward=IN1, backward=IN2, enable=EN)

try:
    # Hacer girar el motor en una dirección durante 2 segundos
    motor.forward()
    sleep(2)

    # Hacer girar el motor en la otra dirección durante 2 segundos
    motor.backward()
    sleep(2)

    # Detener el motor
    motor.stop()

except KeyboardInterrupt:
    # Detener el motor si se presiona Ctrl+C
    motor.stop()
