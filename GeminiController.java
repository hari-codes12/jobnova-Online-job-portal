package com.example.JOBNOVA.JOBNOVA.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/ai")
@CrossOrigin(origins = "*")
public class GeminiController {

    // 🧠 Predefined knowledge base (200+ lines shortened here)
    private static final Map<String, String> KNOWLEDGE_BASE = new HashMap<>();

    static {
        KNOWLEDGE_BASE.put("resume", """
        ✅ Resume Tips:
        • Keep it clear, short (1 page for freshers).
        • Highlight projects, internships, and achievements.
        • Start each bullet with action verbs (Built, Created, Designed...).
        • Mention your LinkedIn, GitHub or portfolio link.
        • Avoid spelling or grammar mistakes.
        """);

        KNOWLEDGE_BASE.put("interview", """
        ✅ Interview Tips:
        • Practice common HR questions like “Tell me about yourself”.
        • Research the company before the interview.
        • Be confident and maintain eye contact.
        • Always ask one smart question at the end.
        • Dress neatly and arrive on time.
        """);

        KNOWLEDGE_BASE.put("linkedin", """
        ✅ LinkedIn Improvement:
        • Use a professional profile picture.
        • Write a catchy headline and clear summary.
        • Add your skills and get endorsements.
        • Post about your projects or learning.
        • Connect with people from your field.
        """);

        KNOWLEDGE_BASE.put("soft skills", """
        ✅ Important Soft Skills:
        • Communication
        • Teamwork
        • Problem-solving
        • Adaptability
        • Time management
        """);

        KNOWLEDGE_BASE.put("yourself", """
        ✅ Answer for “Tell me about yourself”:
        • Start with your education and area of interest.
        • Mention key skills and projects.
        • Talk about internships or certifications.
        • End with your career goal.
        Example:
        “I’m Bala, a passionate computer science student who enjoys building AI and web apps...”
        """);

        KNOWLEDGE_BASE.put("rejection", """
        ✅ Handling Job Rejection:
        • Don’t take it personally.
        • Request feedback to improve.
        • Keep applying and upgrading your skills.
        • Remember — rejection is redirection!
        """);

        KNOWLEDGE_BASE.put("first job", """
        ✅ Preparing for First Job:
        • Learn Git, Java, Spring Boot, SQL basics.
        • Practice communication and presentation skills.
        • Build small real-world projects.
        • Focus on problem-solving and logical thinking.
        """);

        KNOWLEDGE_BASE.put("communication", """
        ✅ Improve Communication:
        • Read English articles daily.
        • Practice speaking in front of a mirror.
        • Watch English interviews or podcasts.
        • Listen more and respond clearly.
        • Be confident — not perfect!
        """);

        // You can add 200+ lines of data like this for your career chatbot
    }

    @PostMapping("/ask")
    public Map<String, String> askOfflineAI(@RequestBody Map<String, String> request) {
        String prompt = request.get("prompt").toLowerCase();

        // Search in our local database
        for (String keyword : KNOWLEDGE_BASE.keySet()) {
            if (prompt.contains(keyword)) {
                return Map.of("response", KNOWLEDGE_BASE.get(keyword));
            }
        }

        // Default fallback
        return Map.of("response",
                "🤖 I'm your JobNova Career Assistant! Ask me about resumes, interviews, LinkedIn, or soft skills.");
    }
}
