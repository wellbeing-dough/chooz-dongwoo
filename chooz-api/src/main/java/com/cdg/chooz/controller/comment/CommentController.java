package com.cdg.chooz.controller.comment;

import com.cdg.chooz.controller.comment.request.CommentCreateRequest;
import com.cdg.chooz.controller.comment.request.CommentGetRequest;
import com.cdg.chooz.controller.comment.request.CommentUpdateRequest;
import com.cdg.chooz.controller.comment.response.CommentGetResponse;
import com.cdg.chooz.controller.common.CommonResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Slice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
@Slf4j
public class CommentController {

//    private final CommentService commentService;

    @Operation(description = "댓글 생성")
    @PostMapping("/votes/{voteId}/comments")
    public ResponseEntity<CommonResponse> createComment(
            @PathVariable Long voteId,
            @RequestBody @Valid CommentCreateRequest commentCreateRequest) {
//        Integer userId = (int) claims.get("userId");
//        Long longId = Long.valueOf(userId);

//        commentService.createComment(voteId, commentCreateRequest.getParentId(), commentCreateRequest.getContent(), longId);

        CommonResponse commonResponse = CommonResponse.builder()
                .message("댓글 생성에 성공했습니다.")
                .build();

        return new ResponseEntity(commonResponse, HttpStatus.OK);
    }


    @Operation(description = "댓글 조회")
    @GetMapping("/votes/{voteId}/comments")
    public ResponseEntity<Slice<CommentGetResponse>> getComment(@PathVariable Long voteId, @ModelAttribute CommentGetRequest commentGetRequest) {

//        CommentListWithCount commentListWithCount = commentService.getComments(voteId, commentGetRequest.getGender(), commentGetRequest.getAge(), commentGetRequest.getMbti(), commentGetRequest.getSize(), commentGetRequest.getPage(), commentGetRequest.getSortBy());

//        List<Comment> comments = commentListWithCount.getComments();
//
//        Pageable pageable = PageRequest.of(commentGetRequest.getPage(), commentGetRequest.getSize());
//
//        int totalCommentCount = commentListWithCount.getCommentCount();
//        int lastPageNumber = (int) Math.ceil((double) totalCommentCount / commentGetRequest.getSize());
//
//        List<CommentGetResponse> commentGetResponse = new ArrayList<>();
//        Map<Long, CommentGetResponse> map = new HashMap<>();
//
//        for (Comment comment : comments) {
//            CommentGetResponse dto = CommentGetResponse.builder()
//                    .id(comment.getId())
//                    .userId(comment.getCommentUser().getId())
//                    .content(comment.getContent())
//                    .gender(comment.getGender())
//                    .imageUrl(comment.getCommentUser().getImageUrl())
//                    .age(comment.getAge())
//                    .mbti(comment.getMbti())
//                    .nickName(comment.getCommentUser().getNickname())
//                    .createdDate(comment.getCreatedDate())
//                    .likeCount(comment.getLikeCount())
//                    .hateCount(comment.getHateCount())
//                    .children(new ArrayList<>()) //NullPointerException 발생
//                    .build();
//            if (comment.getParent() != null) {
//                dto.setParentId(comment.getParent().getId());
//            }
//            map.put(dto.getId(), dto);
//
//            if (comment.getParent() != null) {
//                map.get(comment.getParent().getId()).getChildren().add(dto);
//            } else commentGetResponse.add(dto);
//        }
//        boolean hasNext = commentGetRequest.getPage() < lastPageNumber - 1;


//        Slice<CommentGetResponse> slice = new SliceImpl<>(commentGetResponse, pageable, hasNext);
        return ResponseEntity.ok().body(null);
    }

    @Operation(description = "맛보기 댓글 조회")
    @GetMapping("/votes/{voteId}/comments/hot")
    public ResponseEntity<List<CommentGetResponse>> getHotComment(@PathVariable Long voteId, @ModelAttribute CommentGetRequest commentGetRequest) {
//        List<Comment> comments = commentService.getHotComments(voteId, commentGetRequest.getGender(), commentGetRequest.getAge(), commentGetRequest.getMbti());
//        List<CommentGetResponse> commentGetResponse = new ArrayList<>();
//        Map<Long, CommentGetResponse> map = new HashMap<>();
//
//        for (Comment comment : comments) {
//            CommentGetResponse dto = CommentGetResponse.builder()
//                    .id(comment.getId())
//                    .userId(comment.getCommentUser().getId())
//                    .content(comment.getContent())
//                    .gender(comment.getGender())
//                    .imageUrl(comment.getCommentUser().getImageUrl())
//                    .age(comment.getAge())
//                    .mbti(comment.getMbti())
//                    .nickName(comment.getCommentUser().getNickname())
//                    .createdDate(comment.getCreatedDate())
//                    .likeCount(comment.getLikeCount())
//                    .hateCount(comment.getHateCount())
//                    .children(new ArrayList<>()) //NullPointerException 발생
//                    .build();
//            if (comment.getParent() != null) {
//                dto.setParentId(comment.getParent().getId());
//            }
//            map.put(dto.getId(), dto);
//
//            if (comment.getParent() != null) {
//                map.get(comment.getParent().getId()).getChildren().add(dto);
//            } else commentGetResponse.add(dto);
//        }
        return ResponseEntity.ok().body(null);
    }

    @Operation(description = "댓글 수정")
    @PatchMapping("/votes/{voteId}/comments/{commentId}")
    public ResponseEntity<CommonResponse> updateComment(@PathVariable Long voteId, @PathVariable Long commentId, @Valid @RequestBody CommentUpdateRequest commentUpdateRequest) {
//        Integer userId = (int) claims.get("userId");
//        Long longId = Long.valueOf(userId);
//
//        commentService.updateComment(voteId, commentId, longId, commentUpdateRequest);
//
        CommonResponse commentResponse = CommonResponse.builder()
                .message("댓글 수정에 성공했습니다.")
                .build();

        return new ResponseEntity(commentResponse, HttpStatus.OK);
    }


    @Operation(description = "댓글 삭제")
    @DeleteMapping("/votes/{voteId}/comments/{commentId}")
    public ResponseEntity<CommonResponse> deleteComment(@PathVariable Long voteId, @PathVariable Long commentId) {
//        Integer userId = (int) claims.get("userId");
//        Long longId = Long.valueOf(userId);
//
//        commentService.deleteComment(voteId, commentId, longId);
//
        CommonResponse commentResponse = CommonResponse.builder()
                .message("댓글 삭제에 성공했습니다.")
                .build();

        return new ResponseEntity(commentResponse, HttpStatus.OK);
    }

    @Operation(description = "댓글 좋아요")
    @PostMapping("/votes/{voteId}/comments/{commentId}/likers")
    public ResponseEntity<Map<String, Object>> likeComment(@PathVariable Long voteId, @PathVariable Long commentId) {
//        Integer userId = (int) claims.get("userId");
//        Long longId = Long.valueOf(userId);
//
//        commentService.emoteComment(voteId, commentId, longId, Emotion.LIKE);

        Map<String, Object> result = new HashMap<>();
        result.put("message", "좋아요 성공 코드");

        return ResponseEntity.ok().body(result);
    }

    @Operation(description = "댓글 싫어요")
    @PostMapping("/votes/{voteId}/comments/{commentId}/haters")
    public ResponseEntity<Map<String, Object>> hateComment(@PathVariable Long voteId, @PathVariable Long commentId) {
//        Integer userId = (int) claims.get("userId");
//        Long longId = Long.valueOf(userId);
//
//        commentService.emoteComment(voteId, commentId, longId, Emotion.HATE);

        Map<String, Object> result = new HashMap<>();
        result.put("message", "싫어요 성공 코드");

        return ResponseEntity.ok().body(result);
    }

}
