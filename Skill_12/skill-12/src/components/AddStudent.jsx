import React, { useState, useEffect } from "react";
import axios from "axios";

function AddStudent({ refreshList, editStudent, setEditStudent }) {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [course, setCourse] = useState("");

  useEffect(() => {
    if (editStudent) {
      setName(editStudent.name);
      setEmail(editStudent.email);
      setCourse(editStudent.course);
    }
  }, [editStudent]);

  const handleSubmit = async (e) => {
    e.preventDefault();

    const student = { name, email, course };

    try {
      if (editStudent) {
        await axios.put(
          `http://localhost:8080/students/${editStudent.id}`,
          student,
        );
        setEditStudent(null);
      } else {
        await axios.post("http://localhost:8080/students", student);
      }

      setName("");
      setEmail("");
      setCourse("");
      refreshList();
    } catch (error) {
      console.error("Error saving student:", error);
    }
  };

  return (
    <div>
      <h2>{editStudent ? "Update Student" : "Add Student"}</h2>

      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="Name"
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
        <br />

        <input
          type="email"
          placeholder="Email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
        />
        <br />

        <input
          type="text"
          placeholder="Course"
          value={course}
          onChange={(e) => setCourse(e.target.value)}
        />
        <br />

        <button type="submit">{editStudent ? "Update" : "Add"}</button>
      </form>
    </div>
  );
}

export default AddStudent;
