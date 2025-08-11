package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.SWLegends;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {

    public static void main(String[] args) {

        Queue<SWLegends> fila = new PriorityQueue<>(new SWLegendsPrecoComparator().reversed());
        fila.add(new SWLegends(5L, "Darth Plagueis", 119.9, 0));
        fila.add(new SWLegends(1L, "Heir To The Empire", 124.9, 2));
        fila.add(new SWLegends(4L, "Dark Lord", 123, 3));
        fila.add(new SWLegends(3L, "Shatterpoint", 140, 0));
        fila.add(new SWLegends(2L, "Rogue Planet", 180, 5));

        while (!fila.isEmpty()) {

            System.out.println(fila.poll()); // fifo
        }
    }
}
