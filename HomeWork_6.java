import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.Random;

public class HomeWork_6 {
    public abstract class Animal {
        protected int jump;
        private int runMaxDistance;
        private int swimMaxDistance;
        private float jumpMaxDistance;

        public Animal(int runMaxDistance, int swimMaxDistance, float jumpMaxDistance) {
            this.runMaxDistance = runMaxDistance;
            this.swimMaxDistance = swimMaxDistance;
            this.jumpMaxDistance = jumpMaxDistance;
        }

        public void run(int runDistance) {
            System.out.println("run: " + (runDistance <= runMaxDistance));
        }

        public void swim(int swimDistance) {
            System.out.println("swim: " + (swimDistance <= swimMaxDistance));
        }

        public void jump(float jumpHeight) {
            System.out.println("jump: " + (jumpHeight <= jumpMaxDistance));
        }
    }

    public static void main(String[] args) {
        System.out.println("Кошка: ");
        Animal Murka = new Cat(200, 2, 2);
        Murka.run(1450);
        Murka.swim(2);
        Murka.jump(5);

        System.out.println("Собака: ");
        Animal Tuzik = new Dog(500, 3, 2);
        Tuzik.run(400);
        Tuzik.swim(5);
        Tuzik.jump(5);
    }

    class MainCompetition {
        public static void main(String[] args) {
            Cat cat1 = new Cat("Мурка");
            cat1.CatInfo();
            System.out.println();
            Dog dog1 = new Dog("Тузик");
            dog1.DogInfo();
            System.out.println();
            System.out.println("Спринт");
            System.out.println();
            dog1.Run(11);
            cat1.Run(21);
            System.out.println();
            System.out.println("Плавание");
            dog1.Swim(12);
            cat1.Swim(11);
            System.out.println();
            System.out.println("Прыжки в высоту");
            dog1.Jump(0.1);
            cat1.Jump(3.1);
        }

        class Dog extends Animal {
            private Random rand = new Random();

            public Dog(String name) {
                super(name);
                setMaxRunDistance(rand.nextInt(201) + 400);
                setMaxJumpHeight(rand.nextInt(51) + 50);
                setMaxSwimDistance(rand.nextInt(9) + 7);
            }

            public boolean jump(int height) {
                System.out.println("Препятствие: " + height + "см");
                System.out.println("Собака " + name + "может подпрыгнуть на" + maxJumpHeight + "см");
                System.out.println("прыжок: " + (height <= maxJumpHeight));
                return height <= maxJumpHeight;
            }

            public boolean run(int distance) {
                System.out.println("Длинна: " + distance);
                System.out.println("Собака " + name + "может пробежать на" + maxRunDistance + "м");
                System.out.println("бег: " + (distance <= maxRunDistance));
                return distance <= maxRunDistance;

            }

            public boolean swim(int distance) {
                System.out.println("Длинна: " + distance + "см");
                System.out.println("Собака " + name + "может проплыть" + maxSwimDistance + "м");
                System.out.println("Дистанция: " + (distance <= maxSwimDistance));
                return distance <= maxSwimDistance;
            }

            class Cat extends Animal {
                private Random rand = new Random();

                public Cat(String name) {
                    super(name);
                    setMaxRunDistance(rand.nextInt(201) + 400);
                    setMaxJumpHeight(rand.nextInt(101) + 150);
                    if (rand.nextInt(1000) == 1) {
                        setMaxSwimDistance(rand.nextInt(9) + 7);
                    }

                }

                public boolean jump(int height) {
                    System.out.println("Препятствие: " + height + "см");
                    System.out.println("Кот " + name + "может подпрыгнуть на" + maxJumpHeight + "см");
                    System.out.println("прыжок: " + (height <= maxJumpHeight));
                    return height <= maxJumpHeight;
                }

                public boolean run(int distance) {
                    System.out.println("Длинна: " + distance);
                    System.out.println("Кот " + name + "может пробежать на" + maxRunDistance + "м");
                    System.out.println("бег: " + (distance <= maxRunDistance));
                    return distance <= maxRunDistance;

                }

                public boolean swim(int distance) {
                    System.out.println("Длинна: " + distance + "см");
                    System.out.println("К сожалению, коты не плавают :(");
                }

                private class Animal {
                    public String name;
                    public int run;

                    public Animal() {
                    }

                    public Animal(String name) {
                        this.name = name;
                    }

                    public void animalInfo() {
                        System.out.println();
                    }


                }

                Class Cat extends Animal

                {
                    protected boolean swim;
                    int jump;
      
      public Cat(String name, int run, boolean swim, int jump){
                    this.name = name;
                    this.run = run;
                    this.swim = swim;
                    this.jump = jump;
                }

                }

            }
        }
    }
}

