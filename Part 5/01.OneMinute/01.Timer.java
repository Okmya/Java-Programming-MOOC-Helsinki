/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m.brzyska
 */
public class Timer {

    // Timer przyjmuje setki sekundy oraz sekunde
    private ClockHand hundredthsOfSecond;
    private ClockHand seconds;

    // ustawiamy limity dla tych zmiennych 
    public Timer() {
        this.hundredthsOfSecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    // korzystamy z metody ClockHand
    public void advance() {
        this.hundredthsOfSecond.advance();

        // jezeli setki sekund sie zresetowaly (nabily do 100 i zeszly do 0
        // to zwieksz sekunde o 1
        if (this.hundredthsOfSecond.value() == 0) {
            this.seconds.advance();
        }

    }

    public String toString() {
        return seconds + ":" + hundredthsOfSecond;
    }

}

