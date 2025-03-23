package org.example.section1.prototype;

import java.util.Objects;

public class GithubIssue implements Cloneable{
    private int id;

    private String title;

    private GithubRepository repository;

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GithubRepository getRepository() {
        return repository;
    }

    public void setRepository(GithubRepository repository) {
        this.repository = repository;
    }

    public String getUrl() {
        return repository.getUser() + "/" + repository.getName() + "/" + this.getId();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone(); // 기본적인 얕은복사
        // 깊은복사
        GithubRepository repository = new GithubRepository();
        repository.setUser(this.repository.getUser());
        repository.setName(this.repository.getName());

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(this.id);
        githubIssue.setTitle(this.title);

        return githubIssue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GithubIssue that = (GithubIssue) obj;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
