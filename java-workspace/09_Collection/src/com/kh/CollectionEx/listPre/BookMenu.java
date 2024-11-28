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
            System.out.println("메뉴 번호 입력 : ");
            int choice = sc.nextInt();


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
    public void insertBook(){

        System.out.print("도서명을 입력하세요: ");
        String title = sc.nextLine();

        System.out.print("저자명을 입력하세요: ");
        String author = sc.nextLine();

        System.out.println("장르를 선택하세요 (1. 인문 / 2. 자연과학 / 3. 의료 / 4. 기타): ");
        int category = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        String genre = switch (category) {
            case 1 -> "인문";
            case 2 -> "자연과학";
            case 3 -> "의료";
            case 4 -> "기타";
            default -> {
                System.out.println("잘못된 입력입니다. 기본값 '기타'로 설정합니다.");
                yield "기타";
            }
        };

        System.out.print("가격을 입력하세요: ");
        int price = sc.nextInt();

        Book book = new Book(title, author, category, price);
        books.add(book);

        System.out.println("도서가 성공적으로 추가되었습니다.");
    }

    public void selectList(){
        System.out.println("\n=== 도서 전체 조회 ===");
        if (books.size() > 0) {
            System.out.println("존재하는 도서가 없습니다");
        }else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    public void searchBook(){
        for (Book b : books) {
            if (b.getTitle().equals(b.getAuthor())) {
                System.out.println(b);
            }else{
                System.out.println("검색 결과가 없습니다.");
            }

        }
    }

    public void deleteBook(){
        String title = sc.next();
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
