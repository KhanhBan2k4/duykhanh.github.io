import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean dieukien = true;
        System.out.print("\nNhap so luong nguoi can luu tru thong tin: ");
        int n = sc.nextInt();
        int[] age = new int[3];
        String[] name = new String[20];
        String[] add = new String[50];
        String[] address = new String[50];
        int[] cccd = new int[9];
        do {
            System.out.println("\n  MENU");
            System.out.println("1. Dang ki thong tin ca nhan");
            System.out.println("2. Kiem tra danh sach thong tin ca nhan");
            System.out.println("3. Chinh sua thong tin ca nhan");
            System.out.println("4. Tra cuu thong tin ca nhan bang so CCCD");
            System.out.println("5. Thoat");
            System.out.print("Chon cong viec [1-5]: ");
            int chon = sc.nextInt();
            switch(chon) {
                case 1: {
                    System.out.print("\nDang ki thong tin ca nhan");
                    for(int i=0; i<n; i++) {
                        System.out.printf("\nThong tin nguoi thu %d",i+1);
                        System.out.print("\n- Tuoi: ");
                        age[i] = sc.nextInt();
                        System.out.print("- So can cuoc cong dan: ");
                        cccd[i] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("- Ho va ten: ");
                        name[i] = sc.nextLine();
                        System.out.print("- Dia chi thuong tru: ");
                        add[i] = sc.nextLine();
                        System.out.print("- Dia chi hien tai: ");
                        address[i] = sc.nextLine();
                    }
                } break;
                case 2: {
                    System.out.print("\nXuat thong tin");
                    for(int i=0; i<n; i++) {
                        System.out.printf("\nThong tin nguoi thu %d",i+1);
                        System.out.printf("\n- Tuoi: %d",age[i]);
                        System.out.printf("\n- So can cuoc cong dan: %s",cccd[i]);
                        System.out.printf("\n- Ho va ten: %s",name[i]);
                        System.out.printf("\n- Dia chi thuong tru: %s",add[i]);
                        System.out.printf("\n- Dia chi hien tai: %s",address[i]);
                        System.out.println();
                    }
                }break;
                case 3: {
                    int thaydoi;
                    System.out.print("\nNhap so CCCD nguoi can chinh sua thong tin: ");
                    thaydoi = sc.nextInt();
                    System.out.println("\nMENU - 2");
                    System.out.println("6. Thay doi Ho va ten");
                    System.out.println("7. Thay doi So CCCD");
                    System.out.println("8. Thay doi Dia chi thuong tru");
                    System.out.println("9 Thay doi Tuoi");
                    System.out.println("10. Thay doi Dia chi hien tai");
                    System.out.print("Chon cong viec [6-10]: ");
                    int choose = sc.nextInt();
                    switch(choose) {
                        case 6: {
                            System.out.print("\nThay doi Ho va ten");
                            for(int i=0;i<n;i++) {
                                if(thaydoi==(cccd[i])) {
                                    System.out.print("Ho va ten moi: ");
                                    sc.nextLine();
                                    name[i] = sc.nextLine();
                                } else {
                                    System.out.print("Khong tim thay so CCCD nhu ban da nhap!");
                                }
                            }
                        } break;
                        case 7: {
                            System.out.print("\nThay doi CCCD");
                            for(int i=0;i<n;i++) {
                                if(thaydoi==(cccd[i])) {
                                    System.out.print("So CCCD moi: ");
                                    sc.nextLine();
                                    cccd[i] = sc.nextInt();
                                } else {
                                    System.out.print("Khong tim thay so CCCD nhu ban da nhap!");
                                }
                            }
                        } break;
                        case 8: {
                            System.out.print("\nThay doi Dia chi thuong tru");
                            for(int i=0;i<n;i++) {
                                if(thaydoi==(cccd[i])) {
                                    System.out.print("Dia chi thuong tru moi: ");
                                    sc.nextLine();
                                    add[i] = sc.nextLine();
                                } else {
                                    System.out.print("Khong tim thay so CCCD nhu ban da nhap!");
                                }
                            }
                        } break;
                        case 9: {
                            System.out.print("\nThay doi Tuoi");
                            for(int i=0;i<n;i++) {
                                if(thaydoi==(cccd[i])) {
                                    System.out.print("Tuoi moi: ");
                                    sc.nextLine();
                                    age[i] = sc.nextInt();
                                } else {
                                    System.out.print("Khong tim thay so CCCD nhu ban da nhap!");
                                }
                            }
                        } break;
                        case 10: {
                            System.out.print("\nThay doi Dia chi hien tai");
                            for(int i=0;i<n;i++) {
                                if(thaydoi==(cccd[i])) {
                                    System.out.print("Dia chi hien tai moi: ");
                                    sc.nextLine();
                                    address[i] = sc.nextLine();
                                } else {
                                    System.out.print("Khong tim thay so CCCD nhu ban da nhap!");
                                }
                            }
                        } break;
                        default: System.out.println("Chon so khong co roi keu lam cai gi???");
                    }
                } break;
                case 4: {
                    System.out.println("\nTra cuu thong tin bang so CCCD");
                    int timkiem;
                    System.out.print("Nhap vao so CCCD cua nguoi can tra cuu: ");
                    timkiem = sc.nextInt();
                    for(int i=0;i<n;i++) {
                        if(timkiem==cccd[i]) {
                            System.out.printf("\nThong tin nguoi thu %d",i+1);
                            System.out.printf("\n- Tuoi: %d",age[i]);
                            System.out.printf("\n- So can cuoc cong dan: %s",cccd[i]);
                            System.out.printf("\n- Ho va ten: %s",name[i]);
                            System.out.printf("\n- Dia chi thuong tru: %s",add[i]);
                            System.out.printf("\n- Dia chi hien tai: %s",address[i]);
                        } else {
                            System.out.print("Khong tim thay so CCCD nhu ban da nhap!");
                        }
                    }
                } break;
                case 5: {
                    System.exit(0);
                }
            }
        } while(dieukien);
    }
}