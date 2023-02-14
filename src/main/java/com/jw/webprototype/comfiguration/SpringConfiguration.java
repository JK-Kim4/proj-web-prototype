package com.jw.webprototype.comfiguration;

import com.jw.webprototype.presentation.BoardRepository;
import com.jw.webprototype.presentation.MemoryBoardRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public BoardRepository boardRepository(){
        return new MemoryBoardRepository();
    }
}
