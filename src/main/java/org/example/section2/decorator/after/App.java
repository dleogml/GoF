package org.example.section2.decorator.after;

public class App {
    private static boolean enabledSpamFilter = true;

    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if(enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if(enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        // flag 값에 따라서 Client 클래스에 전달되는 CommentService가 달라짐
        // 둘다 true 라면 decorator가 감싸고 다시 감싸기 때문에 두가지 기능이 포함된
        // CommentService가 전달되어 두개의 기능을 합친 Service를 또 생성하는 before보다
        // 보다 유연하게 사용할 수 있음
        Client client = new Client(commentService);

        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://squidgame.com");
    }
}
