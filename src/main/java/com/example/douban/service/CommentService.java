package com.example.douban.service;

import com.example.douban.mapper.CommentMapper;
import com.example.douban.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommentService {
    private final CommentMapper commentMapper;

    @Autowired
    public CommentService(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    public ArrayList<Comment> findCommentByMovie(String id, String limit, String offset) {
        return commentMapper.findCommentByMovie(id, limit, offset);
    }

    public Integer countCommentByMovie(String id) {
        return commentMapper.countCommentByMovie(id);
    }
}
