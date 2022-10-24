import React from "react";
import Comment from "./Comment";

const comments = [
  { name: "임규훈", comment: "안녕하세요, 개백수입니다." },
  { name: "유재석", comment: "리액트 너무 힘들어요 ㅜㅜ" },
  { name: "유재석", comment: "리액트 너무 힘들어요 ㅜㅜ" },
  { name: "유재석", comment: "리액트 너무 힘들어요 ㅜㅜ" },
  { name: "유재석", comment: "리액트 너무 힘들어요 ㅜㅜ" },
];

function CommentList(props) {
  return (
    <div>
      {comments.map((comment) => {
        return <Comment name={comment.name} comment={comment.comment} />;
      })}
    </div>
  );
}

export default CommentList;
