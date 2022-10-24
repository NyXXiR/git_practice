import React from "react";
import Notification from "./Notification";

const reservedNotifications = [
  { id: 0, message: "hi, here is your schedules." },
  { id: 1, message: "it's lunch time." },
  { id: 2, message: "meeting is getting started soon." },
];

var timer;

class NotificationList extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
      notifications: [],
    };
  }
  componentDidMount() {
    const { notifications } = this.state;
    timer = setInterval(() => {
      if (notifications.length < reservedNotifications.length) {
        const index = notifications.length;
        notifications.push(reservedNotifications[index]);
        this.setState({ notifications: notifications });
      } else {
        clearInterval(timer);
      }
    }, 3000);
  }

  render() {
    return (
      <div>
        {this.state.notifications.map((notification) => {
          return (
            <Notification
              key={notification.id}
              id={notification.id}
              message={notification.message}
            />
          );
        })}
      </div>
    );
  }
}

export default NotificationList;
