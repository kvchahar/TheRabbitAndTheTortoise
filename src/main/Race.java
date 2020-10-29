/*   Created by IntelliJ IDEA.
 *   Author: Krishnaveer Chahar
 *   Date: 29-10-2020
 *   Time: 18:30
 *   File: Tortoise.java
 */
package main;

import thread.rabbit.Rabbit;
import thread.tortoise.Tortoise;

public class Race {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.getRabbit().start();
        Tortoise tortoise = new Tortoise();
        tortoise.start();
    }
}
