# Desafio de código para a empresa Target Sistemas

Este projeto contém em código a resolução das questões de 1 a 3 do desafio, as demais questões serão respondidas ao longo do README.

## Código

Foi utilizado JAVA (JDK 21) para resolver as questões que envolviam código. A classe "Resolucoes" contém as resoluções das questões em forma de métodos.

## Questões 4 e 5

4. Descubra a lógica e complete o próximo elemento:
a) 1, 3, 5, 7, **9**
b) 2, 4, 8, 16, 32, 64, **128**
c) 0, 1, 4, 9, 16, 25, 36, **49**
d) 4, 16, 36, 64, **100**
e) 1, 1, 2, 3, 5, 8, **13**
f) 2,10, 12, 16, 17, 18, 19, **??**

5. Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?
**Resposta:** Supondo que cada lâmpada esteja em uma sala diferente, eu deixaria dois interruptores ligados e um desligado e visitaria a primeira sala. Se a lâmpada estiver apagada, retornaria à sala dos interruptores, desligaria mais um dos interruptores e, em seguida, verificaria outra sala. Dessa forma, já conseguiria identificar quais interruptores correspondem a cada sala. No entanto, se a lâmpada da primeira sala estiver acesa, visitaria a segunda sala. A partir daí, seria possível identificar pelo menos um interruptor corretamente, e os outros dois eu tentaria adivinhar.
