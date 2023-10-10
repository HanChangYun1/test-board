package board.testboard.mapper;

import board.testboard.model.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PostMapper {
    void createPost(String title, String content);
    List<Post> getAllPosts();
    Post getPostById(Long id);
    void updatePost(Long id, String title, String content);
    void deletePost(Long id);
}
