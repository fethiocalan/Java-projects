//create a String array and add some words
//create some forbidden words which are related to the chosen words.
//create tabu table and then
//add correct, pass, Taboo
//add some rules for those
//start with first group and then second group.
//each group will have just 1 minute or maybe more than one

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        //add My words
        String[] words = {
                "TAVLA", "GOOGLE", "BILL GATES", "OKEY",
                "PARA", "ÇORAP", "KALEM", "AŞK",
                "MOUSE", "TAKVİM", "TELEFON", "MÜCEVHER",
                "OJE", "ŞİMŞEK", "STETESKOP", "HASTALIK",
                "KAFATASI", "GAGA", "AHİZE", "ÇERÇEVE",
                "REÇETE", "AKREP", "APLİK", "FUTBOL",
                "BANKA", "DÜĞÜN", "ARABA", "UÇAK",
                "EV", "OFİS", "OTEL", "DOST"
        };

        //choose a random number by the program.
        System.out.println("-----------------------------");
        System.out.println("\t\t\tTABU");
        System.out.println("-----------------------------\n");

        playGame(words);

    }

    public static void createGameBoard(String[] words, int randomNumber) {
        System.out.println();
        System.out.println("\t\t\t\t\t *" + words[randomNumber] + "*");
        forbiddenWords(randomNumber);
    }

    public static void forbiddenWords(int wordsNumber) {
        switch (wordsNumber) {
            case 0:
                System.out.println("\t\t\t\t\t  -zar\n\t\t\t\t\t  -oyun\n\t\t\t\t\t  -yenmek\n\t\t\t\t\t  -kız\n\t\t\t\t\t  -masa");
                break;
            case 1:
                System.out.println("\t\t\t\t\t  -Arama motoru\n\t\t\t\t\t  -Bilgisayar\n\t\t\t\t\t  -internet\n\t\t\t\t\t  -site\n\t\t\t\t\t  -sayfa");
                break;
            case 2:
                System.out.println("\t\t\t\t\t  -zengin\n\t\t\t\t\t  -microsoft\n\t\t\t\t\t  -para\n\t\t\t\t\t  -bilgisayar\n\t\t\t\t\t  -windows");
                break;
            case 3:
                System.out.println("\t\t\t\t\t  -zar\n\t\t\t\t\t  -Istaka\n\t\t\t\t\t  -taş\n\t\t\t\t\t  -4 kişi\n\t\t\t\t\t  -oyun");
                break;
            case 4:
                System.out.println("\t\t\t\t\t  -kağıt\n\t\t\t\t\t  -dolar\n\t\t\t\t\t  -satınalma\n\t\t\t\t\t  -ülke\n\t\t\t\t\t  -kazanmak");
                break;
            case 5:
                System.out.println("\t\t\t\t\t  -ince\n\t\t\t\t\t  -kaçmak\n\t\t\t\t\t  -ten rengi\n\t\t\t\t\t  -parizyen\n\t\t\t\t\t  -ayak");
                break;
            case 6:
                System.out.println("\t\t\t\t\t  -kurşun\n\t\t\t\t\t  -tükenmez\n\t\t\t\t\t  -dolma\n\t\t\t\t\t  -kağıt\n\t\t\t\t\t  -çizi");
                break;
            case 7:
                System.out.println("\t\t\t\t\t  -kalp\n\t\t\t\t\t  -bayan&erkek\n\t\t\t\t\t  -tutku\n\t\t\t\t\t  -kırmızı\n\t\t\t\t\t  -organ");
                break;
            case 8:
                System.out.println("\t\t\t\t\t  -fare\n\t\t\t\t\t  -bilgisayar\n\t\t\t\t\t  -klavye\n\t\t\t\t\t  -tuş\n\t\t\t\t\t  -kedi");
                break;
            case 9:
                System.out.println("\t\t\t\t\t  -yıl\n\t\t\t\t\t  -ay\n\t\t\t\t\t  -hafta\n\t\t\t\t\t  -gün\n\t\t\t\t\t  -sayı");
                break;
            case 10:
                System.out.println("\t\t\t\t\t  -alo\n\t\t\t\t\t  -ahize\n\t\t\t\t\t  -tuş\n\t\t\t\t\t  -ses\n\t\t\t\t\t  -numara");
                break;
            case 11:
                System.out.println("\t\t\t\t\t  -kadın\n\t\t\t\t\t  -takı\n\t\t\t\t\t  -altın\n\t\t\t\t\t  -bilezik\n\t\t\t\t\t  -kolye");
                break;
            case 12:
                System.out.println("\t\t\t\t\t  -tırnak\n\t\t\t\t\t  -renk\n\t\t\t\t\t  -sürmek\n\t\t\t\t\t  -aseton\n\t\t\t\t\t  -manikür");
                break;
            case 13:
                System.out.println("\t\t\t\t\t  -gökyüzü\n\t\t\t\t\t  -yağmur\n\t\t\t\t\t  -ışık\n\t\t\t\t\t  -gürültü\n\t\t\t\t\t  -akşam");
                break;
            case 14:
                System.out.println("\t\t\t\t\t  -ses\n\t\t\t\t\t  -kalp\n\t\t\t\t\t  -doktor\n\t\t\t\t\t  -boyun\n\t\t\t\t\t  -kulak");
                break;
            case 15:
                System.out.println("\t\t\t\t\t  -hastane\n\t\t\t\t\t  -hasta\n\t\t\t\t\t  -doktor\n\t\t\t\t\t  -hemire\n\t\t\t\t\t  -ilaç");
                break;
            case 16:
                System.out.println("\t\t\t\t\t  -beyin\n\t\t\t\t\t  -saç\n\t\t\t\t\t  -kemik\n\t\t\t\t\t  -arkeoloji\n\t\t\t\t\t  -kazı");
                break;
            case 17:
                System.out.println("\t\t\t\t\t  -kuş\n\t\t\t\t\t  -yemek\n\t\t\t\t\t  -yavru\n\t\t\t\t\t  -solucan\n\t\t\t\t\t  -ağaçkakan");
                break;
            case 18:
                System.out.println("\t\t\t\t\t  -telefon\n\t\t\t\t\t  -ses\n\t\t\t\t\t  -alo\n\t\t\t\t\t  -tuş\n\t\t\t\t\t  -kabin");
                break;
            case 19:
                System.out.println("\t\t\t\t\t  -cam\n\t\t\t\t\t  -resim\n\t\t\t\t\t  -pimapen\n\t\t\t\t\t  -ahşap\n\t\t\t\t\t  -gözlük");
                break;
            case 20:
                System.out.println("\t\t\t\t\t  -doktor\n\t\t\t\t\t  -ilaç\n\t\t\t\t\t  -prospektüs\n\t\t\t\t\t  -imza\n\t\t\t\t\t  -eczane");
                break;
            case 21:
                System.out.println("\t\t\t\t\t  -burç\n\t\t\t\t\t  -saat\n\t\t\t\t\t  -yelkovan\n\t\t\t\t\t  -zaman\n\t\t\t\t\t  -ibre");
                break;
            case 22:
                System.out.println("\t\t\t\t\t  -duvar\n\t\t\t\t\t  -ışık\n\t\t\t\t\t  -lamba\n\t\t\t\t\t  -aydınlık\n\t\t\t\t\t  -süs");
                break;
            case 23:
                System.out.println("\t\t\t\t\t  -top\n\t\t\t\t\t  -iddia\n\t\t\t\t\t  -kale\n\t\t\t\t\t  -stadyum\n\t\t\t\t\t  -maç");
                break;
            case 24:
                System.out.println("\t\t\t\t\t  -müşteri\n\t\t\t\t\t  -para\n\t\t\t\t\t  -hesap\n\t\t\t\t\t  -çek\n\t\t\t\t\t  -kredi kartı");
                break;
            case 25:
                System.out.println("\t\t\t\t\t  -gelin\n\t\t\t\t\t  -damat\n\t\t\t\t\t  -misafir\n\t\t\t\t\t  -yüzük\n\t\t\t\t\t  -evlenmek");
                break;
            case 26:
                System.out.println("\t\t\t\t\t  -ulaşım\n\t\t\t\t\t  -araç\n\t\t\t\t\t  -hız\n\t\t\t\t\t  -fren\n\t\t\t\t\t  -gaz");
                break;
            case 27:
                System.out.println("\t\t\t\t\t  -uçmak\n\t\t\t\t\t  -hava\n\t\t\t\t\t  -hız\n\t\t\t\t\t  -hostes\n\t\t\t\t\t  -pilot");
                break;
            case 28:
                System.out.println("\t\t\t\t\t  -oda\n\t\t\t\t\t  -salon\n\t\t\t\t\t  -wc\n\t\t\t\t\t  -yaşamak\n\t\t\t\t\t  -yuva");
                break;
            case 29:
                System.out.println("\t\t\t\t\t  -çalışmak\n\t\t\t\t\t  -para\n\t\t\t\t\t  -fotokopi\n\t\t\t\t\t  -faks\n\t\t\t\t\t  -telefon");
                break;
            case 30:
                System.out.println("\t\t\t\t\t  -uyumak\n\t\t\t\t\t  -tatil\n\t\t\t\t\t  -hizmet\n\t\t\t\t\t  -yıldız\n\t\t\t\t\t  -masaj");
                break;
            case 31:
                System.out.println("\t\t\t\t\t  -güven\n\t\t\t\t\t  -samimi\n\t\t\t\t\t  -dürüst\n\t\t\t\t\t  -namuslu\n\t\t\t\t\t  -ahlaklı");
                break;
        }
    }

    public static void playGame(String[] words) {
        Random random = new Random();
        int pointGroup1 = 0;
        int pointGroup2 = 0;
        int pass1 = 3;
        int pass2 = 3;
        int countRound = 1;

        String timeFinish = "a";

        Scanner sc = new Scanner(System.in);
        System.out.print("1. grubun adı = ");
        String group1 = sc.nextLine();
        System.out.print("2. grubun adı = ");
        String group2 = sc.nextLine();
        System.out.print("kaç tur oynamak istersiniz = ");
        int round = sc.nextInt();
        sc.nextLine();


        while (round != 0) {
            System.out.println("\n\t\t\t\t\t\t" + countRound + ". TUR");

            System.out.print(group1 + " takımı başlayacak. başlamak için Başla yazabilirsin = ");
            String startGroup1 = sc.nextLine();
            //first group.
            while (!timeFinish.equalsIgnoreCase("z")) {
                if (startGroup1.equalsIgnoreCase("başla") || startGroup1.equalsIgnoreCase("basla")) {
                    int wordsNumber = random.nextInt(words.length);
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("\t\t\t\t\t" + group1 + " SIRASI");
                    System.out.println(group1 + " grubunun puanı = " + pointGroup1 + "\t|\t" + group2 + " grubunun puanı = " + pointGroup2 +
                            "\n Pas hakkı = " + pass1 + "\t\t\t\t\t  Pas hakkı = " + pass2);
                    createGameBoard(words, wordsNumber);
                    System.out.println();
                    System.out.println("Doğru(d)   Tabu(t)   Pass(p)   Zaman bitti(z)   aynı soru(a)");
                    System.out.print(" ");
                    String rule = sc.nextLine();
                    if (rule.equalsIgnoreCase("d")) {
                        pointGroup1++;
                    } else if (rule.equalsIgnoreCase("t")) {
                        pointGroup1--;
                    } else if (rule.equalsIgnoreCase("p")) {
                        pass1--;
                    } else if (rule.equalsIgnoreCase("z")) {
                        break;
                    }
                }

            }
            System.out.println("hello");
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.print(group1 + " süresi doldu. şimdi sıra " + group2 + " de. hazırsan başla yazarak başlayabilirsin = ");
            String startGroup2 = sc.nextLine();
            //second group.
            while (!timeFinish.equalsIgnoreCase("z")) {
                if (startGroup2.equalsIgnoreCase("başla") || startGroup1.equalsIgnoreCase("basla")) {
                    int wordsNumber = random.nextInt(words.length);
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("\t\t\t\t\t" + group2 + " SIRASI");
                    System.out.println(group1 + " grubunun puanı = " + pointGroup1 + "\t|\t" + group2 + " grubunun puanı = " + pointGroup2 +
                            "\n  Pas hakkı = " + pass1 + "\t\t\t\t\t  Pas hakkı = " + pass2);

                    createGameBoard(words, wordsNumber);
                    System.out.println();
                    System.out.println("Doğru(d)   Tabu(t)   Pass(p)   Zaman bitti(z)   aynı soru(a)");
                    System.out.print(" ");
                    String rule = sc.nextLine();
                    if (rule.equalsIgnoreCase("d")) {
                        pointGroup2++;
                    } else if (rule.equalsIgnoreCase("t")) {
                        pointGroup2--;
                    } else if (rule.equalsIgnoreCase("p")) {
                        pass2--;
                    } else if (rule.equalsIgnoreCase("z")) {
                        break;
                    }
                }

            }
            countRound++;
            round--;

        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\t\t\tSCOR TABLOSU");
        System.out.println("-----------------------------------");
        System.out.println("\t\t" + group1 + " takımının puanı = " + pointGroup1);
        System.out.println("\t\t" + group2 + " takımınkın puanı = " + pointGroup2);
        if (pointGroup1 > pointGroup2) {
            System.out.println("\t\tkazanan takım = " + group1 + " takımı");
            System.out.println("\t\tTEBRİKLER");
        } else if (pointGroup2 > pointGroup1) {
            System.out.println("\t\tkazanan takım = " + group2 + " takımı");
            System.out.println("\t\tTEBRİKLER");
        } else {
            System.out.println("\t\tBERABERE");
        }
        System.out.println("-----------------------------------");

    }

}

