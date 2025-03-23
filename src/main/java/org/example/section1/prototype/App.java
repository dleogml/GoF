package org.example.section1.prototype;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteShip");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("### 프로토타입 ###");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());

        repository.setUser("DaeHee");

        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());
        System.out.println(clone.getRepository() == githubIssue.getRepository()); // clone은 기본적으로 얕은복사이다

        System.out.println(clone.getUrl());

        // * 중요 *
        // clone != githubIssue 다른 인스턴스이기 때문
        // clone.equals(githubIssue) => 내용은 같기 때문에 true가 나옴

        // TODO : ModelMapper
        // GithubIssueData githubIssueData = modelMapper.map(githubIssue, GithubIssueData.class);

    }
}
