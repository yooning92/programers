const solution = (my_string, indices) => {
    return [...my_string].map((key, value) =>
        indices.includes(value) ? 0 : key).filter(key => key !== 0).join("")
}