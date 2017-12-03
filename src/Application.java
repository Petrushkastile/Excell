import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        Reader1 reader1 = new Reader1();

        originator.setState( reader1.getTablica() );
        reader1.getekran();
        caretaker.setMemento( originator.saveState() );

        System.out.println( '\n' + "Введите номер строки которую хотите заменить:" );
        Scanner scanner = new Scanner( System.in );
        reader1.setNomerStroki( scanner.nextInt() );
        System.out.println( reader1.getIzmena() );

        String stroka2 = reader1.getOldName() + ",        " + reader1.getOldSurname() + ",        " + reader1.getOldAge();

        caretaker.setMementoName( originator.saveName() );
        originator.setName( stroka2 );

        System.out.println( "Введите новое имя:" );
        Scanner scanname = new Scanner( System.in );

        reader1.setName( scanname.nextLine() );

        String stroka3 = reader1.getName() + ",        " + reader1.getOldSurname() + ",        " + reader1.getOldAge();

        caretaker.setMementoName( originator.saveName() );
        originator.setName( stroka3 );

        System.out.println( "Введите новую фамилию:" );
        Scanner scansurname = new Scanner( System.in );
        reader1.setSurname( scansurname.nextLine() );

        String stroka4 = reader1.getName() + ",        " + reader1.getSurname() + ",        " + reader1.getOldAge();

        caretaker.setMementoSurname( originator.saveName() );
        originator.setName( stroka4 );

        System.out.println( "Введите возраст:" );
        Scanner scanage = new Scanner( System.in );
        reader1.setAge( scanage.nextLine() );

        String stroka5 = reader1.getName() + ",        " + reader1.getSurname() + ",        " + reader1.getAge();

        caretaker.setMementoAge( originator.saveName() );
        originator.setName( stroka5 );

        System.out.println( reader1.getIzmenennaya() );

        originator.setState( reader1.izmeniy() );

        System.out.println( "Отмена действий [1],Сохранить изменения[2],Выход без изменений[3],Выход[4]" );
        int a = 0;
        int b = 0;
        int c = 0;
        while (a != 3 || a != 4) {
            Scanner sc = new Scanner( System.in );
            a = sc.nextInt();
            switch (a) {
                case 1:
                    b++;
                    c++;
                    if (b == 1) {
                        originator.restoreName( caretaker.getMementoAge() );
                        System.out.println( "view:" + originator.getName() );
                    }
                    if (b == 2) {
                        originator.restoreName( caretaker.getMementoSurname() );
                        System.out.println( "view:" + originator.getName() );
                    }
                    if (b == 3) {
                        originator.restoreName( caretaker.getMementoName() );
                        System.out.println( "view:" + originator.getName() );
                    }
                    break;
                case 2:
                    if (c == 0) {
                        FileUtils.write( "F:/untitled/src/output.csv", " " );
                        reader1.setIzmenennaya( reader1.getIzmenennaya() );
                        for (int i = 0; i < reader1.izmeniy().size(); i++) {
                            FileUtils.update( "F:/untitled/src/output.csv", reader1.izmeniy().get( i ) );
                        }
                    }
                    if (c == 1) {
                        originator.restoreName( caretaker.getMementoAge() );
                        reader1.setIzmenennaya( originator.getName() );
                        FileUtils.write( "F:/untitled/src/output.csv", " " );
                        for (int i = 0; i < reader1.izmeniy().size(); i++) {
                            FileUtils.update( "F:/untitled/src/output.csv", reader1.izmeniy().get( i ) );
                        }
                    }
                    if (c == 2) {
                        originator.restoreName( caretaker.getMementoSurname() );
                        reader1.setIzmenennaya( originator.getName() );
                        FileUtils.write( "F:/untitled/src/output.csv", " " );
                        for (int i = 0; i < reader1.izmeniy().size(); i++) {
                            FileUtils.update( "F:/untitled/src/output.csv", reader1.izmeniy().get( i ) );
                        }
                    }
                    if (c == 3) {
                        originator.restoreName( caretaker.getMementoName() );
                        reader1.setIzmenennaya( originator.getName() );
                        FileUtils.write( "F:/untitled/src/output.csv", " " );
                        for (int i = 0; i < reader1.izmeniy().size(); i++) {
                            FileUtils.update( "F:/untitled/src/output.csv", reader1.izmeniy().get( i ) );
                        }
                    }
                    break;
                case 3:
                    FileUtils.write( "F:/untitled/src/output.csv", " " );
                    for (int i = 0; i < reader1.getTablica().size(); i++) {
                        FileUtils.update( "F:/untitled/src/output.csv", reader1.getTablica().get( i ) );
                    }
                    break;
                case 4:
                    System.out.println( "До новых встреч" );
                    break;
            }
        }
    }
}

