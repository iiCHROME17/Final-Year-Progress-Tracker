import React from 'react';
import './App.css';

const navItems = [
  'Project Overview',
  'Tasks',
  'Milestone Calendar',
  'Advisor Feedback',
  'Documentation & Resources',
];

const tasks = Array.from({ length: 9 }, (_, i) => ({ id: i + 1, title: `Task ${i + 1}` }));
const milestones = [
  { id: 1, title: 'TASK A', status: 'complete' },
  { id: 2, title: 'TASK A', status: 'complete' },
  { id: 3, title: 'TASK A', status: 'complete' },
  { id: 4, title: 'TASK A', status: 'complete' },
];
const messages = [
  'Welcome to your dashboard!',
  'Advisor feedback will appear here.',
];

function App() {
  return (
    <div className="dashboard-container">
      {/* Left Sidebar */}
      <aside className="sidebar-left">
        <div className="sidebar-title">FYPT</div>
        <nav className="sidebar-nav">
          {navItems.map((item, idx) => (
            <div
              key={item}
              className={
                'sidebar-nav-item' + (item === 'Tasks' ? ' active' : '')
              }
            >
              {item}
            </div>
          ))}
        </nav>
        <div className="sidebar-bottom">
          <div>Account Information</div>
          <div>Logout</div>
        </div>
      </aside>

      {/* Main Content */}
      <main className="main-content">
        <h1 className="main-title">TASKS</h1>
        <div className="task-grid">
          {tasks.map((task) => (
            <div className="task-card" key={task.id} />
          ))}
        </div>
      </main>

      {/* Right Sidebar */}
      <aside className="sidebar-right">
        <div className="milestones-section">
          <div className="milestones-title">Upcoming Milestones</div>
          {milestones.map((m) => (
            <div className="milestone-row" key={m.id}>
              <span>{m.title}</span>
              <span className="milestone-status">{m.status}</span>
            </div>
          ))}
        </div>
        <div className="messages-section">
          <div className="messages-title">MESSAGES</div>
          {messages.map((msg, idx) => (
            <div className="message" key={idx}>{msg}</div>
          ))}
        </div>
      </aside>
    </div>
  );
}

export default App;
