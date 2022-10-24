import React, { useState, useEffect } from "react";

function UserStatus(props) {
  const inOnline = useUserStatus(props.user.id);
  if (isOnline === null) {
    return "대기중...";
  }
  return isOnline ? "온라인" : "오프라인";

  function useUserStatus(userID) {
    const [isOnline, setIsOnline] = useState(null);
  }
  useEffect(() => {
    function handleStatusChange(status) {
      setIsOnline(status.isOnline);
    }

    ServerAPI.subscribeUserStatus(props.user.id, handleStatusCHange);
    return () => {
      ServerAPI.unsubscribeUserStatus(props.user.id, handleStatusChange);
    };
  });
  return inOnline;
}
