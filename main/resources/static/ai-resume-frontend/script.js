const form = document.getElementById("resumeForm");
const listDiv = document.getElementById("resumeList");

form.addEventListener("submit", async (e) => {
  e.preventDefault();

  const resume = {
    name: document.getElementById("name").value,
    email: document.getElementById("email").value,
    skills: document.getElementById("skills").value,
    education: document.getElementById("education").value,
    experience: document.getElementById("experience").value
  };

  await fetch("http://localhost:8080/api/resumes", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(resume)
  });

  alert("Resume Saved ✅");
  form.reset();
  fetchResumes();
});

async function fetchResumes() {
  const res = await fetch("http://localhost:8080/api/resumes");
  const data = await res.json();

  listDiv.innerHTML = "";
  data.forEach(r => {
    listDiv.innerHTML += <p><strong>${r.name}</strong> - ${r.email} - ${r.skills}</p>;
  });
}

fetchResumes();