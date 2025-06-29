package com.jjoaooliveira.kanban.module.kanbanboard.application.adapter;

import java.util.List;

import com.jjoaooliveira.kanban.module.kanbanboard.application.MemberDTO;

public interface MemberAdapter {
    List<MemberDTO> queryMembers(Long boardId);
}
