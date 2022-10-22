import React from "react";

function Comment(props) {
  <div className="comeent">
    <UserInfo user={props.author} />
    <div className="comment-text">{props.text}</div>
    <div className="comment-date">{formatDate(props.date)}</div>
  </div>;
}

function Avatar(props) {
  return (
    <img className="avatar" src={props.user.avatarUrl} alt={props.user.name} />
  );
}

function UserInfo(props) {
  return (
    <div className="user-info">
      <Avatar user={props.user} />
      <div className="user-info-name">{props.user.name}</div>
    </div>
  );
}
