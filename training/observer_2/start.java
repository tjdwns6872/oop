package training.observer_2;

public class start {
    public static void main(String[] args) {
        // Topic 생성
        Topic topic = new Topic();

        // 구독자 추가
        Follower alice = new Follower("Alice");
        Follower bob = new Follower("Bob");
        Follower charlie = new Follower("Charlie");

        topic.add(alice);
        topic.add(bob);
        topic.add(charlie);

        // 게시글 작성
        topic.write("New Post 1");

        // 구독자 제거
        topic.remove(bob);

        // 게시글 작성
        topic.write("New Post 2");
    }
}
