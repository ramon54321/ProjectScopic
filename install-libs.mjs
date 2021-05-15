#!/usr/bin/env zx

const packageJson = JSON.parse(await fs.readFile("./package.json"))

packageJson.libs.forEach(async (lib) => await $`wget -P libs ${lib}`)
