import React, { useState } from "react";
import StudentList from "./components/StudentList";
import AddStudent from "./components/AddStudent";

function App() {
  const [refresh, setRefresh] = useState(false);
  const [editStudent, setEditStudent] = useState(null);

  const refreshList = () => {
    setRefresh(!refresh);
  };

  return (
    <div>
      <h1>Student Management System</h1>

      <AddStudent
        refreshList={refreshList}
        editStudent={editStudent}
        setEditStudent={setEditStudent}
      />

      <StudentList refresh={refresh} onEdit={setEditStudent} />
    </div>
  );
}

export default App;
