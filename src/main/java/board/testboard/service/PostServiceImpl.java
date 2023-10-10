package board.testboard.service;

import board.testboard.mapper.PostMapper;
import board.testboard.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostMapper postMapper;

    @Override
    public void createPost(Post post) {
        postMapper.createPost(post.getTitle(), post.getContent());
    }

    @Override
    public List<Post> getAllPosts() {
        return postMapper.getAllPosts();
    }

    @Override
    public Post getPostById(Long id) {
        return postMapper.getPostById(id);
    }

    @Override
    public void updatePost(Post post) {
        postMapper.updatePost(post.getId(), post.getTitle(), post.getContent());
    }

    @Override
    public void deletePost(Long id) {
        postMapper.deletePost(id);
    }
}
