package com.jw.webprototype.comfiguration;

import com.jw.webprototype.presentation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public BoardRepository boardRepository(){
        return new MemoryBoardRepository();
    }

    @Bean
    public CommentRepository commentRepository() {
        return new MemoryCommentRepository();
    }

    @Bean
    public UserRepository userRepository(){return new MemoryUserRepository();}


}
