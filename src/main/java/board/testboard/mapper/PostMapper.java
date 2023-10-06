package board.testboard.mapper;

import board.testboard.model.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PostMapper {
    List<Post> getAllPosts();
    Post getPostById(Long id);
    void createPost(Post post);
    void updatePost(Post post);
    void deletePost(Long id);
}
