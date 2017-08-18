<template>
  <div>
    <h3>{{ feature.name }}</h3>
    <p>{{ feature.description }}</p>
    <div>{{ feature.score }}</div>
    <button type="submit" class="o-button as--success"><i class="fa fa-thumbs-up "></i> +1</button>
    <button type="submit" class="o-button as--danger"><i class="fa fa-thumbs-down"></i> -1</button>
    <hr/>
  </div>
</template>

<script>
export default {
  name: 'feature',
  props: ['feature'],
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
