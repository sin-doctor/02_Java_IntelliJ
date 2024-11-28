package com.kh.CollectionEx.listPre;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    ArrayList<Book> books = new ArrayList<Book>();
    Book b = new Book();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        while (true) {
            System.out.println("== Welcome KH Library == ");
            System.out.println(" ");
            System.out.println("******* 메인 메뉴 *******");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 입력 : ");
            int choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {
                case 1:
                insertBook();
                break;
                case 2:
                selectList();
                break;
                case 3:
                searchBook();
                break;
               case 4:
                deleteBook();
                break;
                case 9:
                System.out.println("프로그램 종료");
                return;
                default:
                System.out.println("잘못 입력하셨습니다. 다시 시도해주세요.");
                break;
            }
        }

    }
    public void insertBook() {

        System.out.print("도서명을 입력하세요:");
        String title = sc.nextLine();

        System.out.print("저자명을 입력하세요:");
        String author = sc.nextLine();

        System.out.println("장르를 선택하세요 (1. 인문 / 2. 자연과학 / 3. 의료 / 4. 기타):");
        int category = sc.nextInt();
        switch (category) {
            case 1:
                System.out.println("인문");
                break;
                case 2:
                    System.out.println("자연과학");
                    break;
                    case 3:
                        System.out.println("의료");
                        break;
                        case 4:
                            System.out.println("기타");
                            break;
                            default:
                                System.out.println("잘못입력하셨습니다!");
                                break;
        }
        System.out.println("가격을 입력하세요. : ");
        int price = sc.nextInt();
        books.add(new Book(title, author, category, price));
        System.out.println("도서 추가 완료");
    }





    public void selectList(){
        System.out.println("\n=== 도서 전체 조회 ===");

        if (books.size() < 0) {
            System.out.println("존재하는 도서가 없습니다");
        }else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    public void searchBook(){
        System.out.println("===== 도서 검색 =====");
        System.out.println("제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.println("저자를 입력해주세요. : ");
        String author = sc.nextLine();
        for (Book b : books) {
            if (b.getTitle().equals(b.getAuthor())) {
                System.out.println(b);
            }else{
                System.out.println("검색 결과가 없습니다.");
            }

        }
    }

    public void deleteBook(){
        System.out.println("===== 도서 삭제 =====");
        System.out.println("삭제할 도서명 : ");
        String title = sc.next();
        System.out.println("삭제할 저자명 : ");
        String author = sc.next();
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).getTitle().equals(title) && books.get(i).getAuthor().equals(author)){
                books.remove(i);
                System.out.println("성공적으로 삭제되었습니다.");
            }else{
                System.out.println("삭제할 도서를 찾지 못했습니다.");
            }
        }

    }

}
