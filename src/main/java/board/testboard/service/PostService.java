// src/main/java/com/example/service/PostService.java

package board.testboard.service;

import board.testboard.model.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    Post getPostById(Long id);
    void createPost(Post post);
    void updatePost(Post post);
    void deletePost(Long id);
}
