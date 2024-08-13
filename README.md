# Spring AI with Groq


## Configuring Spring AI for Groq

Use the application.properties or application.yml file to set up environmental variables
for Groq.

spring.ai.openai.api-key=<GROQ_API_KEY> (Register first then you can generate your api token from here https://console.groq.com/keys)

spring.ai.openai.base-url=https://api.groq.com/openai (The base-url is set to Groq's API endpoint)

spring.ai.openai.chat.options.model=llama3-70b-8192(Here you can choose one of the available LLM)

spring.ai.openai.chat.options.temperature=0.7

Initially you can check how does api works with simple controller and send the request:

## URL:

    http://localhost:8080/ai/generateStream

## Request example:

```
{
    "message": "what is the wheather in Paris"
}
```

## Response:

```
Bonjour!

To provide you with the current weather in Paris, I'll need to make an API call to a weather service. Let me just that...

**Current Weather in Paris:**

According to OpenWeather, the current weather in Paris, France is:

* **Condition:** Partly Cloudy* **Temperature:**22°C (72°F)
* **Humidity:**56%
 **Wind Speed:** km/h (10 mph)
* **Description:** Partly cloudy with a of24 (75) and a low of18°C (64°F)

Please note that weather conditions are subject to change, and this information is only accurate at the time of my knowledge cutoff. If you'd like more up-to-date or detailed information, I can suggest some weather websites or apps for you to check!

Would you like to know more about Paris or is there something else I can help you with?
```

## URL:

    http://localhost:8080/ai/generate

## Request example:

```
{
    "message": "what is the pi"
}
```

## Response:

```
{
    "generation": "A mathematical question!\n\nPi (π) is a mathematical constant that represents the ratio of a circle's circumference to its diameter. It's approximately equal to 3.14159, but it's an irrational number, which means it can't be expressed exactly as a finite decimal or fraction.\n\nIn other words, pi is a never-ending, non-repeating sequence of digits that goes on forever without repeating. It's a fundamental constant in mathematics and appears in many mathematical formulas, particularly in geometry and trigonometry.\n\nHere are some interesting facts about pi:\n\n* Pi is an ancient mathematical constant that has been known since ancient civilizations, including the Egyptians and Babylonians.\n* Pi is a transcendental number, which means it's not the root of any polynomial equation with rational coefficients.\n* Pi is an irrational number, which means it can't be expressed as a simple fraction (like 1/2 or 3/4).\n* Pi is approximately equal to 3.14159, but it has been calculated to over 31.4 trillion digits using advanced computer algorithms and mathematical techniques.\n* Pi is celebrated on March 14th (3/14) as Pi Day, since the first three digits of pi are 3.14.\n\nI hope that helps! Do you have any other questions about pi?"
}
```


