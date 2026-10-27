package org.example.section3.iterator.after;

import org.example.section3.iterator.after.Post;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴 게임");
        board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?");
        board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.");

        // Board 를 통해 Post 를 사용할 때 어떤한 구조에 담아져 있는지 노출됨
        // 만약 Board 코드가 List 가 아닌 다른 것으로 바꼈을 때 Client 코드 또한 변경이 필요한 문제가 발생

       /* // TODO 들어간 순서대로 순회하기
//        List<Post> posts = board.getPosts();
//        Iterator<Post> iterator = posts.iterator();
        Iterator<Post> iterator = board.getDefaultIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }

        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }*/

        List<Post> posts = board.getPosts();
        Iterator<Post> iterator = posts.iterator();
        System.out.println(iterator.getClass());

        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        // TODO 가장 최신 글 먼저 순회하기
        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while(recentPostIterator.hasNext()) {
            System.out.println(recentPostIterator.next().getTitle());
        }
    }
}
