package com.springwebservice2.demo.Service.posts;

import com.springwebservice2.demo.web.domain.posts.Posts;
import com.springwebservice2.demo.web.domain.posts.PostsRepository;
import com.springwebservice2.demo.web.dto.PostsResponseDto;
import com.springwebservice2.demo.web.dto.PostsSaveRequestDto;
import com.springwebservice2.demo.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto reuqestDto) {
        return postsRepository.save(reuqestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id).orElseThrow(()
                -> new IllegalArgumentException("해당 게시물이 없습니다. id=" + id));

        posts.update(requestDto.getTitle(),requestDto.getContent());
        return id;
    }
    public PostsResponseDto findById(Long id){
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        return new PostsResponseDto(posts);
    }

}
